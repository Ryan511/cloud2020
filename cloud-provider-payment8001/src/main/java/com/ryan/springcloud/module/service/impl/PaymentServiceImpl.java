package com.ryan.springcloud.module.service.impl;

import com.ryan.springcloud.module.entity.Payment;
import com.ryan.springcloud.module.mapper.PaymentMapper;
import com.ryan.springcloud.module.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhongziqi
 * @since 2021-09-15
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
