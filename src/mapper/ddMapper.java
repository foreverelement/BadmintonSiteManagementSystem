package mapper;

import bean.dd;
import bean.union;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

import java.util.LinkedList;

public interface ddMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dd record);
    int deldd(Integer id);
    int getddstotal();
    int gettotalfdds();
    union  undd(Integer id);
    int setdd(Integer id);
    LinkedList<dd> getdds(int cur);
    LinkedList<dd> getfdds(int cur);
    LinkedList<dd>  getAllprepdd(Integer member);
    LinkedList<dd>  getAlldd(Integer member);

    int insertSelective(dd record);
    int indd(dd dd);

    dd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dd record);

    int updateByPrimaryKey(dd record);
}