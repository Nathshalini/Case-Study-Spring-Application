package com.wf.mybatis.companyservice.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wf.mybatis.companyservice.model.StockPrice;

import java.sql.*;
import java.sql.Date;

@Mapper
public interface StockPriceMapper {

	@Select("select * from stock_price where company_id=#{arg0} AND date BETWEEN #{arg1} AND #{arg2}")
	List<StockPrice> findAllprices(int cid,Date fromdate, Date todaDate);
}