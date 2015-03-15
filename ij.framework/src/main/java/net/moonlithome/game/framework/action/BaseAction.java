package net.moonlithome.game.framework.action;

import net.moonlithome.game.framework.util.JsonBeanUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MF on 3/15/2015.
 */
public class BaseAction {

    protected String getJsonFromRequest(HttpServletRequest request) throws Exception {

        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = null;
        String line;

        try {
            reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return buffer.toString();
    }

    protected void responseJson(HttpServletResponse response, Object o) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json");

        response.getWriter().print(JsonBeanUtil.beanToJson(o));
    }
}
