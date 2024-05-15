package com.wsl.model.converter;

import com.wsl.model.entity.Room;
import com.wsl.model.pojo.params.RoomParam;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-15T11:04:04+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class RoomConverterImpl implements RoomConverter {

    @Override
    public Room roomParam2Room(RoomParam userParam) {
        if ( userParam == null ) {
            return null;
        }

        Room room = new Room();

        if ( userParam.getHeadImg() != null ) {
            room.setHeadImg( userParam.getHeadImg() );
        }
        else {
            room.setHeadImg( "https://static.wslhome.top/OnlineChat/headerImg/xxx.jpg" );
        }
        room.setName( userParam.getName() );
        room.setNickName( userParam.getNickName() );
        room.setLeader( userParam.getLeader() );
        room.setDetail( userParam.getDetail() );
        room.setNotice( userParam.getNotice() );

        return room;
    }
}
