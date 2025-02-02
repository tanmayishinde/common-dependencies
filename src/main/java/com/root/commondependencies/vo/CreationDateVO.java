package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CreationDateVO {
    private Date startDate;
    private Date endDate;
}
