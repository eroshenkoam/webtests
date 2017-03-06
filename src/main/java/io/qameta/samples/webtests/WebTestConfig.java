package io.qameta.samples.webtests;

import org.aeonbits.owner.Config;

/**
 * eroshenkoam
 * 06.03.17
 */
@Config.Sources({"classpath:{env}.properties", "classpath:local.properties"})
public interface WebTestConfig extends Config {

    @Key("service.url")
    String getUrl();

}
