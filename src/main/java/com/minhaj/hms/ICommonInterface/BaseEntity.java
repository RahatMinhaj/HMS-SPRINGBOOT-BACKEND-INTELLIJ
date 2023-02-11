package com.minhaj.hms.ICommonInterface;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;


@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public abstract class BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @CreatedDate
    private LocalDateTime createdAt;

    private Integer createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private Integer updatedBy;

    private Boolean active;
    @PrePersist
    public void prePersist() {
        this.active = true;
    }
}
