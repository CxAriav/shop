package com.amazon.elasticache;

import java.io.IOException;
import java.net.InetSocketAddress;

// Import the &AWS;-provided library with Auto Discovery support 
import net.spy.memcached.MemcachedClient;  

public class AutoDiscoveryDemo {

    public static void main(String[] args) throws IOException { 
        MemcachedClient client1 = new MemcachedClient(new InetSocketAddress("MemCache_1", 123)); 

	InetSocketAddress address = new InetSocketAddress("MemCache_2", 123);
        MemcachedClient client2 = new MemcachedClient(address);     
		
    }
}