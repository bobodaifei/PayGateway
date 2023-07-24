package com.bobo.gateway.component.convert;

import com.bobo.gateway.entity.WXpay;
import com.bobo.gateway.pojo.dto.WXpayDTO;
import com.bobo.gateway.pojo.dto.WXpayXml1DTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-24T12:32:44+0800",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230622-1425, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class WXpayConvertImpl implements WXpayConvert {

    @Override
    public WXpay toEntity(WXpayDTO dto) {
        if ( dto == null ) {
            return null;
        }

        WXpay wXpay = new WXpay();

        wXpay.setOutTradeNo( dto.getOut_trade_no() );
        wXpay.setTotalFee( dto.getTotal_fee() );
        wXpay.setSpbillCreateIp( dto.getSpbill_create_ip() );
        wXpay.setRedirectUrl( dto.getRedirect_url() );
        wXpay.setNotifyUrl( dto.getNotify_url() );
        wXpay.setBody( dto.getBody() );

        return wXpay;
    }

    @Override
    public WXpay toEntity(WXpayXml1DTO dto) {
        if ( dto == null ) {
            return null;
        }

        WXpay wXpay = new WXpay();

        wXpay.setOutTradeNo( dto.getOut_trade_no() );
        wXpay.setMchId( dto.getMch_id() );
        wXpay.setResultCode( dto.getResult_code() );
        wXpay.setTradeType( dto.getTrade_type() );
        wXpay.setTransactionId( dto.getTransaction_id() );
        wXpay.setSettlementTotalFee( dto.getSettlement_total_fee() );
        wXpay.setTimeEnd( dto.getTime_end() );
        wXpay.setAppid( dto.getAppid() );
        wXpay.setOpenid( dto.getOpenid() );

        return wXpay;
    }
}
