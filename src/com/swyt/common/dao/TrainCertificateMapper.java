package com.swyt.common.dao;

import com.swyt.common.entity.TrainCertificate;
import com.swyt.common.entity.TrainCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainCertificateMapper {
    int countByExample(TrainCertificateExample example);

    int deleteByExample(TrainCertificateExample example);

    int deleteByPrimaryKey(String id);

    int insert(TrainCertificate record);

    int insertSelective(TrainCertificate record);

    List<TrainCertificate> selectByExample(TrainCertificateExample example);

    TrainCertificate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TrainCertificate record, @Param("example") TrainCertificateExample example);

    int updateByExample(@Param("record") TrainCertificate record, @Param("example") TrainCertificateExample example);

    int updateByPrimaryKeySelective(TrainCertificate record);

    int updateByPrimaryKey(TrainCertificate record);
}