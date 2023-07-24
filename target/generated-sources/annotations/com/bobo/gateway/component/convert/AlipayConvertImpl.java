package com.bobo.gateway.component.convert;

import com.bobo.gateway.entity.Alipay;
import com.bobo.gateway.pojo.dto.AlipayDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-24T12:32:44+0800",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230622-1425, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class AlipayConvertImpl implements AlipayConvert {

    @Override
    public Alipay toEntity(AlipayDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Alipay alipay = new Alipay();

        alipay.setOutTradeNo( dto.getOut_trade_no() );
        alipay.setTotalAmount( dto.getTotal_amount() );
        alipay.setProductCode( dto.getProduct_code() );
        alipay.setReturnUrl( dto.getReturn_url() );
        alipay.setNotifyUrl( dto.getNotify_url() );
        alipay.setSubject( dto.getSubject() );

        return alipay;
    }
}
