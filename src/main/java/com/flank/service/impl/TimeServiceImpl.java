package com.flank.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.flank.beans.Time;
import com.flank.mapper.TimeMapper;
import com.flank.service.TimeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author Flank
 * @since 2019-03-08
 */
@Service
public class TimeServiceImpl extends ServiceImpl<TimeMapper, Time> implements TimeService {

}
