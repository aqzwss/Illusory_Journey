package net.moonlithome.game.server;

import com.sun.prism.impl.BaseContext;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.framework.dto.BaseServerDto;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by MF on 3/29/2015.
 */
public class HttpClientUtil {

    /**
     * test server base url
     */
    public static String baseUrl = "http://localhost:8080";
    /**
     * test server post client
     * @param serverUrl
     * @param postDto
     * @return
     */
    public static BaseCommunicationDto doPost(String serverUrl, BaseServerDto postDto){
        BaseCommunicationDto result = new BaseCommunicationDto();
        try {
            if(postDto != null) {
                HttpClient httpClient = HttpClientBuilder.create().build();
                HttpPost httpPost = new HttpPost(new URI(baseUrl + serverUrl));
                System.out.println("HTTP CONNECTION REQUEST URI:" + baseUrl + serverUrl);
                StringEntity requestJson = new StringEntity(JsonBeanUtil.beanToJson(postDto));
                requestJson.setContentEncoding("UTF-8");
                requestJson.setContentType("application/json");
                httpPost.setEntity(requestJson);
                HttpResponse httpResponse = httpClient.execute(httpPost);
                System.out.println("HTTP CONNECTION STATUS:" + httpResponse.getStatusLine().getStatusCode());
                if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), "UTF-8"));
                    StringBuilder builder = new StringBuilder();
                    for(String line = null; (line = reader.readLine()) != null;){
                        builder.append(line).append("\n");
                    }
                    result = JsonBeanUtil.getBeanFromJson(builder.toString(), BaseCommunicationDto.class);
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }
}
