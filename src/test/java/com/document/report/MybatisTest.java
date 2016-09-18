package com.document.report;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2016/9/18.
 */
public class MybatisTest {
    @Test
    public void testSqlSessionFactory() throws IOException {
        Reader reader = Resources.getResourceAsReader("config/mybatis.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = factory.openSession();

        session.close();
    }
}
