package edu.gyc.lover.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.gyc.lover.model.Lover;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ls
 * @since 2019-10-29
 */
public interface LoverDao extends BaseMapper<Lover> {

    public List<String> getAllLoverNames();
}
