package com.example.hub.domain.type;

public enum HubAddress {
    서울특별시센터("서울특별시 송파구 송파대로 55"),
    경기북부센터("경기도 고양시 덕양구 권율대로 570"),
    경기남부센터("경기도 이천시 덕평로 257-21"),
    부산광역시센터("부산 동구 중앙대로 206"),
    대구광역시센터("대구 북구 태평로 161"),
    인천광역시센터("인천 남동구 정각로 29"),
    광주광역시센터("광주 서구 내방로 111"),
    대전광역시센터("대전 서구 둔산로 100"),
    울산광역시센터("울산 남구 중앙로 201"),
    세종특별자치시센터("세종특별자치시 한누리대로 2130"),
    강원특별자치도센터("강원특별자치도 춘천시 중앙로 1"),
    충청북도센터("충북 청주시 상당구 상당로 82"),
    충청남도센터("충남 홍성군 홍북읍 충남대로 21"),
    전북특별자치도센터("전북특별자치도 전주시 완산구 효자로 225"),
    전라남도센터("전남 무안군 삼향읍 오룡길 1"),
    경상북도센터("경북 안동시 풍천면 도청대로 455"),
    경상남도센터("경남 창원시 의창구 중앙대로 300");


    private final String centerAddress;

    HubAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    public String getCenterAddress() {
        return centerAddress;
    }
}
