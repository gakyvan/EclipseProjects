/*
 * Created on Jan 22, 2018
 */
package edu.mum.asd.facade;


public interface IConnection {
    
    public void execute(String sql,String sqlCall);
    public void executeSql(String sql);
    public void executeCall(String sql);

}
