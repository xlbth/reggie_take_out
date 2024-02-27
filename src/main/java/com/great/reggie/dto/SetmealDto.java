package com.great.reggie.dto;

import com.great.reggie.entity.Setmeal;
import com.great.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
