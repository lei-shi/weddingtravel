
package com.wt.service;

import com.wt.bean.table.Recommend;
import com.wt.dao.RecommendDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ghm
 * Date: 14-5-5
 * Time: 下午11:41
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class RecommendService {
    @Resource
    @Autowired
    private RecommendDao recommendDao;

    public List<Recommend> getRecomendListByModuleId(int module_id){
        return recommendDao.getRecommendByModuleId(module_id);
    }
}
