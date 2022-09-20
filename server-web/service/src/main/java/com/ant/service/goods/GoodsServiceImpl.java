package com.ant.service.goods;

import com.ant.domain.Products;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
     * @return {@link Products}
     */
    @Override
    public List<Products> activityQuery(String no) {
        String sql = "select * from products";
        return (List<Products>) jdbcTemplate.query(sql, new RowMapper<Products>(){

            @Override
            public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
                Products products = new Products();
                products.setId(rs.getLong("ID"));
                products.setNo(rs.getString("NO"));
                products.setName(rs.getString("NAME"));
                products.setNormalPrice(rs.getString("NORMAL_PRICE"));
                return products;
            }

        });
//        return jdbcTemplate.queryForList(sql, Goods.class);
    }

}
