package com.example.Mockito.Exercise02;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ExternalApi 
{
    void call() {}
}

class MyService 
{
    private final ExternalApi api;

    MyService(ExternalApi api) 
    {
        this.api=api;
    }

    void perform() 
    {
        api.call();
    }
}

public class MyServiceTest 
{
    @Test
    void testVerification() 
    {
        ExternalApi mockApi=mock(ExternalApi.class);
        MyService service=new MyService(mockApi);
        service.perform();
        verify(mockApi).call();
    }
}
