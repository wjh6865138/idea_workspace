package com.wangkuo.zxb.coreservice.hessian;

import org.slf4j.LoggerFactory;
import org.springframework.remoting.caucho.HessianServiceExporter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义HessianServiceExporter，方便在此做扩展
 * @author 守锦
 * @version 1.0
 */
public class CustomHessianServiceExporter extends HessianServiceExporter {

    /**
     * logger
     */
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(CustomHessianServiceExporter.class);

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("try ==> requestURI"+request.getRequestURI());
        super.handleRequest(request, response);
    }
}
