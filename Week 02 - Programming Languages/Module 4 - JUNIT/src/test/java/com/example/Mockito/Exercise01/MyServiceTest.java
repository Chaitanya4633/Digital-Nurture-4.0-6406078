package com.example.Mockito.Exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ExternalApi 
{
    String fetchData() 
    {
        return "data";
    }
}

class MyService 
{
    private final ExternalApi api;

    MyService(ExternalApi api) 
    {
        this.api=api;
    }

    String getData() 
    {
        return api.fetchData();
    }
}

public class MyServiceTest 
{
    @Test
    void testMocking() 
    {
        ExternalApi mockApi=mock(ExternalApi.class);
        when(mockApi.fetchData()).thenReturn("mocked data");

        MyService service=new MyService(mockApi);
        assertEquals("mocked data", service.getData());
    }
}
