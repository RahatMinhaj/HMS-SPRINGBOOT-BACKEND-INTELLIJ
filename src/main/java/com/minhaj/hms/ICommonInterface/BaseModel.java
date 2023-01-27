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
public abstract class BaseModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Boolean active;

    @CreatedDate
    private LocalDateTime createdAt;

    private Integer createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private Integer updatedBy;

    @PrePersist
    public void prePersist() {
        this.active = true;
    }
}
