package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoansMapper {
    LoansDto toDto(Loans loans);
    Loans toEntity(LoansDto loansDto);
}
