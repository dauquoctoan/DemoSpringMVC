package DemoSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DemoSpringMVC.Dto.MapperProductsDto;
import DemoSpringMVC.Dto.ProductsDto;

@Repository
public class ProductsDao extends BaseDao{
	
	public StringBuffer getSqlProduct() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id AS id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.sizes ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.details ");
		sql.append(",c.id AS id_color ");
		sql.append(",c.name AS name_color ");
		sql.append(",c.code AS code_color ");
		sql.append(",c.img ");
		sql.append(",p.created_at ");
		sql.append(",p.updated_at ");
		sql.append("FROM products as p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.id_product ");
		return sql;
	}
	
	public String getSqlNewProduct() {
		StringBuffer  sql = getSqlProduct();
		sql.append("WHERE p.new_product = true ");
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("LIMIT 8;");
		return sql.toString();
	}
	public String getSqlHighlightProduct() {
		StringBuffer  sql = getSqlProduct();
		sql.append("WHERE p.highlight = true ");
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("LIMIT 12;");
		return sql.toString();
	}
	
	
	public List<ProductsDto> getDataHighlightProducts(){
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		String sql = getSqlHighlightProduct();
		list = _jdbcTemplate.query(sql, new MapperProductsDto());
		return list;
	}
	
	public List<ProductsDto> getDataNewProducts(){
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		String sql = getSqlNewProduct();
		list = _jdbcTemplate.query(sql, new MapperProductsDto());
		return list;
	}
}
