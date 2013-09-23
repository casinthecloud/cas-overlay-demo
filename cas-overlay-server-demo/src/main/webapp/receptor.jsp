<%@page import="org.slf4j.Logger,org.slf4j.LoggerFactory" %>
<%
Logger logger = LoggerFactory.getLogger("org.jasig.cas.JSP");
logger.info("query string : {}", request.getQueryString());
%> 
