package com.yrgo.elevermanagement;

import javax.ejb.ApplicationException;

/**
 * @author Danijela
 */

@ApplicationException(rollback = true)
public class ServiceUnavailableException extends Exception{

}
