package com.hendisantika.datetest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : date-test
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 09.13
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RekapLive {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(length = 40)
    private String id;

    @Temporal(TemporalType.DATE)
    private Date tanggal;

    private String kode;

    private int terisi;

    private int sisa;

    @Temporal(TemporalType.TIME)
    private Date catat;

}
