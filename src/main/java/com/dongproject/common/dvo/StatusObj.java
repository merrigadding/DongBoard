package com.dongproject.common.dvo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusObj {

	private StatusEnum status;
    private String message;
    private Object data;

    public StatusObj() {
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }
}
