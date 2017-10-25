package com.jx.dev.hris.services.impls;

import com.jx.dev.hris.entities.PositionMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jx.dev.hris.services.PositionService;

/**
 *
 * @author jx
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    
 
    @Override
    public Iterable <PositionMaster> getAllPositions() {
        return null;
    }
 
    @Override
    public PositionMaster getPositionById(Integer id) {
        return null;
    }
    
}
