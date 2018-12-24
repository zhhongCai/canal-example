package com.test.canal;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CanalProperties {
    @Value("${item_destination}")
    private String itemDestination;
    @Value("${cancelIp}")
    private String cancelIp;
    @Value("${cancelPort}")
    private Integer cancelPort;
}
