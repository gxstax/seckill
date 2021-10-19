package com.ant.service.goods;

import com.ant.domain.Goods;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @author Ant
 * @since 2021/10/9 8:30 下午
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    private final JdbcTemplate jdbcTemplate;

    public GoodsServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * <p>
     * 查询商品列表
     * </p>
     *
     * @param no
     * @return {@link Goods}
     */
    @Override
    public List<Goods> activityQuery(String no) {
        String sql = "select * from goods";
        return (List<Goods>) jdbcTemplate.query(sql, new RowMapper<Goods>(){

            @Override
            public Goods mapRow(ResultSet rs, int rowNum) throws SQLException {
                Goods goods = new Goods();
                goods.setId(rs.getLong("ID"));
                goods.setNo(rs.getString("NO"));
                goods.setName(rs.getString("NAME"));
                return goods;
            }

        });
//        return jdbcTemplate.queryForList(sql, Goods.class);
    }

}
