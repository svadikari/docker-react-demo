package com.shyam.dockerreactdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author SVadikari on 12/27/18
 */

@Data
@AllArgsConstructor
public class OrderResponse {
    private String status;
    private String userMsg;
}
