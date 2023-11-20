function processInput() {
    var input = document.getElementById('userInput').value;
    var output = document.getElementById('output');

    if (["1393", "ㅈㅅ", "살자", "뒤지고싶다", "힘들다", "너무힘들어", "우울해", "불안해"].includes(input)) {
        output.innerHTML = "당신은 혼자가 아닙니다. 1393으로 연락하세요";
    } else {
        var message = "???" + input;
        if (["야근해", "야근", "오늘 회식", "집가고싶다", "쉬고싶다", "출근안하냐", "칼퇴"].includes(input)) {
            message += "(....)";
        }
        output.innerHTML = message;
    }
}
