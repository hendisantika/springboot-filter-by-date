package com.hendisantika.datetest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : date-test
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 09.17
 */
public interface RekapLivaRepository extends JpaRepository<RekapLive, String> {
    List<RekapLive> findAllByTanggal(Date tanggal);
}
