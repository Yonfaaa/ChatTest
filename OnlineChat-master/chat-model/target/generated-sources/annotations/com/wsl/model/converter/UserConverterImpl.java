package com.wsl.model.converter;

import com.wsl.model.entity.User;
import com.wsl.model.pojo.params.UserParam;
import com.wsl.model.pojo.vos.UserVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T11:04:04+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public User userParam2User(UserParam userParam) {
        if ( userParam == null ) {
            return null;
        }

        User user = new User();

        if ( userParam.getHeadImg() != null ) {
            user.setHeadImg( userParam.getHeadImg() );
        }
        else {
            user.setHeadImg( "https://static.wslhome.top/OnlineChat/headerImg/xxx.jpg" );
        }
        user.setId( userParam.getId() );
        user.setName( userParam.getName() );
        user.setPassword( userParam.getPassword() );
        user.setNickName( userParam.getNickName() );
        user.setQq( userParam.getQq() );
        user.setWx( userParam.getWx() );
        user.setEmail( userParam.getEmail() );
        user.setPhone( userParam.getPhone() );
        user.setSex( userParam.getSex() );

        return user;
    }

    @Override
    public UserVO user2UserVO(User user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setAvatar( user.getHeadImg() );
        userVO.setId( user.getId() );
        userVO.setName( user.getName() );
        userVO.setNickName( user.getNickName() );
        userVO.setAuthority( user.getAuthority() );

        return userVO;
    }
}
