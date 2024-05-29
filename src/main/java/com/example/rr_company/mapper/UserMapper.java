package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.request.RegisterRequest;
import com.example.rr_company.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Mapper(componentModel = "spring",imports = {LocalDateTime.class, Timestamp.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "createdAt",expression = "java(Timestamp.valueOf(LocalDateTime.now()))")
    User toUser(RegisterRequest registerRequest);
}
