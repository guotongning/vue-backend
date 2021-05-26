package com.ning.demo.vuebackend.memchche;

import com.ning.demo.vuebackend.entity.Domain;

import java.util.*;
import java.util.stream.Collectors;

public class DomainListCache {
    private static final List<Domain> domainList = new ArrayList<>();
    private static final Map<Long, Domain> domainMap = new HashMap<>();

    static {
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            domainList.add(new Domain()
                    .setId(i + 1L)
                    .setDomain("www.baidu.com_" + (i + 1))
                    .setDescription("百度_" + (i + 1))
                    .setStatus((i % 2 == 0) ? 1 : -1)
                    .setCreateTime(currentTime)
                    .setUpdateTime(currentTime));
        }
        domainMap.putAll(domainList.stream().collect(Collectors.toMap(Domain::getId, domain -> domain)));
    }

    public static List<Domain> listAll() {
        return Collections.unmodifiableList(domainList);
    }

    public static Domain getById(Long id) {
        return domainMap.get(id);
    }

}
