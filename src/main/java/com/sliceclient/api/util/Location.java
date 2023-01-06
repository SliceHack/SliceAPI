package com.sliceclient.api.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Location {
    private double x, y, z;
    private float yaw, pitch;
}
