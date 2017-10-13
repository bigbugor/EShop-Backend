package cn.sinjinsong.eshop.core.service.product.impl;

import cn.sinjinsong.eshop.core.dao.product.ProductCategoryDOMapper;
import cn.sinjinsong.eshop.core.dao.product.ProductDOMapper;
import cn.sinjinsong.eshop.core.domain.entity.product.ProductCategoryDO;
import cn.sinjinsong.eshop.core.domain.entity.product.ProductDO;
import cn.sinjinsong.eshop.core.service.product.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SinjinSong on 2017/10/6.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDOMapper productDOMapper;
    @Autowired
    private ProductCategoryDOMapper productCategoryDOMapper;

    @Transactional(readOnly = true)
    @Override
    public ProductCategoryDO findCategoryById(Long categoryId) {
        return productCategoryDOMapper.selectByPrimaryKey(categoryId);
    }
    
    @Transactional(readOnly = true)
    @Override
    public List<ProductCategoryDO> findAllCategories(boolean containsProducts) {
        if(containsProducts){
            return productCategoryDOMapper.findAll();
        }else{
            return productCategoryDOMapper.findAllWithOutProducts();
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<ProductCategoryDO> findCategoriesOnBoard() {
        return productCategoryDOMapper.findOnBoard();
    }

    @Override
    public List<ProductDO> findProductsOnPromotion() {
        return productDOMapper.findOnPromotion();
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<ProductDO> findProductByCategory(Long categoryId, Integer pageNum, Integer pageSize) {
        return productDOMapper.findByCategoryPaging(categoryId, pageNum, pageSize).toPageInfo();
    }

    @Transactional(readOnly = true)
    @Override
    public ProductDO findProductById(Long productId) {
        return productDOMapper.selectByPrimaryKey(productId);
    }

    @Transactional
    @Override
    public void saveProduct(ProductDO product) {
        productDOMapper.insert(product);
    }

    @Transactional
    @Override
    public void updateProduct(ProductDO product) {
        productDOMapper.updateByPrimaryKeySelective(product);
    }

    @Transactional
    @Override
    public void saveCategory(String categoryName) {
        productCategoryDOMapper.insert(new ProductCategoryDO(categoryName));
    }

    @Transactional
    @Override
    public void updateCategory(ProductCategoryDO category) {
        productCategoryDOMapper.updateByPrimaryKeySelective(category);
    }
}
