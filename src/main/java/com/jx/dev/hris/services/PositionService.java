package com.jx.dev.hris.services;

import com.jx.dev.hris.entities.PositionMaster;

/**
 *
 * @author jx
 */
public interface PositionService {
    Iterable<PositionMaster> getAllPositions();
    public PositionMaster getPositionById(Integer id);
    
}
