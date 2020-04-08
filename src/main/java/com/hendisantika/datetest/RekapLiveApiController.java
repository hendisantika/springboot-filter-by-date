package com.hendisantika.datetest;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA. Project : date-test User: hendisantika Email: hendisantika@gmail.com
 * Telegram : @hendisantika34 Date: 08/04/20 Time: 09.18
 */
@Log4j2
@RestController
@RequestMapping("api/rekap")
public class RekapLiveApiController {
  @Autowired
  private RekapLivaRepository rekapLivaRepository;

  @Autowired
  private ModelMapper modelMapper;

  @GetMapping
  public List<RekapLiveDto> getAllData() {
    List<RekapLiveDto> dtos;
    List<RekapLive> rekapLiveList = rekapLivaRepository.findAll();
    log.info(String.format("jumlah %s record", "" + rekapLiveList.size()));
    if (!rekapLiveList.isEmpty()) {
      dtos = rekapLiveList.stream().map(this::convertToDto).collect(Collectors.toList());
      log.info("Data {}", rekapLiveList);
      return dtos;
    }

    return new ArrayList<>();
  }

  @GetMapping("/findByDate/{date}")
  public List<RekapLiveDto> findByDate(
          @PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
    try {
      log.info("Date {}", date);
      List<RekapLiveDto> dtos = new ArrayList<>();
      List<RekapLive> rekapLiveByTanggal = rekapLivaRepository.findAllByTanggal(date);
      log.info(String.format("jumlah %s record", "" + rekapLiveByTanggal.size()));
      if (!rekapLiveByTanggal.isEmpty()) {
        //                rekapLiveByTanggal.forEach(rekapLive -> {
        //                    RekapLiveDto dto = modelMapper.map(rekapLive, RekapLiveDto.class);
        //                    dtos.add(dto);
        //                });
        dtos = rekapLiveByTanggal.stream().map(this::convertToDto).collect(Collectors.toList());
      }
      return dtos;
    } catch (Exception e) {
      log.error(e.getMessage());
    }
    return new ArrayList<>();
  }

  private RekapLiveDto convertToDto(RekapLive rekapLive) {
    RekapLiveDto rekapLiveDto = modelMapper.map(rekapLive, RekapLiveDto.class);
    rekapLiveDto.setTanggal(rekapLive.getTanggal());
    return rekapLiveDto;
  }
}
