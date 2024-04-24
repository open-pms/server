package com.openpms.server.user.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import com.openpms.server.user.User;

import java.time.Instant;

public class GetResult {
    private final User user;

    public GetResult(User user) {
        this.user = user;
    }

    public String getEmail() {
        return user.getEmail();
    }

    public String getName() {
        return user.getName();
    }

    public String getAvatar() {
        return user.getAvatar();
    }

    public int getStatus() {
        return user.getStatus();
    }

    @JSONField(name = "create_time")
    public Instant getCreateTime() {
        return user.getCreateTime();
    }

    @JSONField(name = "update_time")
    public Instant getUpdateTime() {
        return user.getUpdateTime();
    }
}