package cn.kaimadata.rn.service.impl;

import cn.kaimadata.rn.domain.User;
import cn.kaimadata.rn.mapper.UserMapper;
import cn.kaimadata.rn.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shibun
 * @since 2019-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
