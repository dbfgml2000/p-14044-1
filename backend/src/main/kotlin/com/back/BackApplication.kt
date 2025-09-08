package com.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
@EnableCaching // 스프링 캐시 활성화(이건 딱히 지금 필요하지는 않음, 추후 레디스 캐시를 사용할 때 추가해도 됩니다.)
class BackApplication

fun main(args: Array<String>) {
    runApplication<BackApplication>(*args)
}
