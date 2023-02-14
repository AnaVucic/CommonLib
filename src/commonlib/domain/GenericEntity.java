package commonlib.domain;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

public interface GenericEntity extends Serializable {
    
    //sve ovo pogledati i izbaciti sta nije potrebeno
    
    String getTableName();
    
    String getColumnNamesForInsert();

    String getInsertValues();

    String getInsertValuesUnprepared();

    void prepareStatement(PreparedStatement statement) throws SQLException;

    // NOT IN USE
    void setID(Long id);

    String getSelectCondition();

    // NOT IN USE
    String getDeleteCondition();

    // NOT IN USE
    String getDeleteConditionForItem();

    String getUpdateCondition();

    String setAttributes();

    List<GenericEntity> getList(ResultSet rs) throws Exception;

    String getSpecificSelectCondition();
}
