package com.docker.one.controller.requestdto;

import com.docker.one.model.base.DataEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ersin on 16.11.2019.
 */
@ToString
@Getter
@Setter
public class FootballerRequestDTO extends DataEntity {
    private int worth;
}
