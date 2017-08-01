<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="UserServiceImpProxyid" scope="session" class="guru.soap.service.UserServiceImpProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
UserServiceImpProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = UserServiceImpProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        UserServiceImpProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        guru.soap.service.UserServiceImp getUserServiceImp10mtemp = UserServiceImpProxyid.getUserServiceImp();
if(getUserServiceImp10mtemp == null){
%>
<%=getUserServiceImp10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String id_1id=  request.getParameter("id26");
        int id_1idTemp  = Integer.parseInt(id_1id);
        guru.soap.model.User getUser15mtemp = UserServiceImpProxyid.getUser(id_1idTemp);
if(getUser15mtemp == null){
%>
<%=getUser15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getUser15mtemp != null){
%>
<%=getUser15mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typename20 = getUser15mtemp.getName();
        String tempResultname20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename20));
        %>
        <%= tempResultname20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">job:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typejob22 = getUser15mtemp.getJob();
        String tempResultjob22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typejob22));
        %>
        <%= tempResultjob22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getUser15mtemp != null){
%>
<%=getUser15mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String id_2id=  request.getParameter("id31");
        int id_2idTemp  = Integer.parseInt(id_2id);
        boolean deleteUser28mtemp = UserServiceImpProxyid.deleteUser(id_2idTemp);
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteUser28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
break;
case 33:
        gotMethod = true;
        String age_4id=  request.getParameter("age38");
        int age_4idTemp  = Integer.parseInt(age_4id);
        String name_5id=  request.getParameter("name40");
            java.lang.String name_5idTemp = null;
        if(!name_5id.equals("")){
         name_5idTemp  = name_5id;
        }
        String job_6id=  request.getParameter("job42");
            java.lang.String job_6idTemp = null;
        if(!job_6id.equals("")){
         job_6idTemp  = job_6id;
        }
        String id_7id=  request.getParameter("id44");
        int id_7idTemp  = Integer.parseInt(id_7id);
        %>
        <jsp:useBean id="guru1soap1model1User_3id" scope="session" class="guru.soap.model.User" />
        <%
        guru1soap1model1User_3id.setAge(age_4idTemp);
        guru1soap1model1User_3id.setName(name_5idTemp);
        guru1soap1model1User_3id.setJob(job_6idTemp);
        guru1soap1model1User_3id.setId(id_7idTemp);
        boolean addUser33mtemp = UserServiceImpProxyid.addUser(guru1soap1model1User_3id);
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addUser33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
case 46:
        gotMethod = true;
        guru.soap.model.User[] getAllPersons46mtemp = UserServiceImpProxyid.getAllPersons();
if(getAllPersons46mtemp == null){
%>
<%=getAllPersons46mtemp %>
<%
}else{
        String tempreturnp47 = null;
        if(getAllPersons46mtemp != null){
        java.util.List listreturnp47= java.util.Arrays.asList(getAllPersons46mtemp);
        tempreturnp47 = listreturnp47.toString();
        }
        %>
        <%=tempreturnp47%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>