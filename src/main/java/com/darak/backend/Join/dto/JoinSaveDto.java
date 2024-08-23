package com.darak.backend.Join.dto;

import com.darak.backend.Item.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class JoinSaveDto {
    private String item_name;
    private String store_name;
    private int join_price;
    private int join_limit;
    private int join_percent;
    private String join_start_day;
    private String join_end_day;
}
