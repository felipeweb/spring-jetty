package org.springframework;

/**
 * Created by felipeweb on 11/04/15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String webappDirLocation = getWebAppDir();

        String webXmlLocation = getWebXmlLocation(webappDirLocation);

        SpringServer springServer = new SpringServer(webappDirLocation, webXmlLocation);

        springServer.start();
    }

    private static String getWebXmlLocation(String webappDirLocation) {
        String webxml = System.getenv("SPRING_WEBXML");
        webxml = webxml == null ? webappDirLocation + "/WEB-INF/web.xml" : webxml;
        return webxml;
    }

    private static String getWebAppDir() {
        return System.getProperty("spring.webappdir", "src/main/webapp/");
    }

}
