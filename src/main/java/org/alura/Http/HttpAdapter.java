package org.alura.Http;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> dados);

}
