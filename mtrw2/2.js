(function (){
    let provinceNode = document.getElementById('province');
    let cityNode = document.getElementById('city');
    let countryNode = document.getElementById('country');
        let provinceStr = '';
        for(let i = 0; i < province.length; i++){
            provinceStr += `<option value=${province[i].item_code}>${province[i].item_name}</option>`;
        }
        provinceNode.innerHTML = provinceStr;
    
        let cityArr =[], j = 0;
        {
            for (let i = 0; i < city.length; i++) {
                if (city[i].item_code - provinceNode.value >= 100 && city[i].item_code - provinceNode.value < 10000)
                    cityArr[j++] = city[i];
            }
            let cityStr = '';
            for (let k = 0; k < cityArr.length; k++) {
                cityStr += `<option value=${cityArr[k].item_code}>${cityArr[k].item_name}</option>`;
            }
            cityNode.innerHTML = cityStr;
        }
    let countryArr =[], k = 0;
    {
        for (let i = 0; i < country.length; i++) {
            if (country[i].item_code - cityNode.value > 0 && country[i].item_code - cityNode.value < 100)
                countryArr[k++] = country[i];
        }
        let countryStr = '';
        for (let l = 0; l < countryArr.length; l++) {
            countryStr += `<option value=${countryArr[l].item_code}>${countryArr[l].item_name}</option>`;
        }
        countryNode.innerHTML = countryStr;
    }

    provinceNode.onchange=function() {
    let cityArr =[], j = 0;
    {
        for (let i = 0; i < city.length; i++) {
            if (city[i].item_code - provinceNode.value >= 100 && city[i].item_code - provinceNode.value < 10000)
                cityArr[j++] = city[i];
        }
        let cityStr = '';
        for (let k = 0; k < cityArr.length; k++) {
            cityStr += `<option value=${cityArr[k].item_code}>${cityArr[k].item_name}</option>`;
        }
            cityNode.innerHTML = cityStr;
    }

    }

    cityNode.onchange=function(){
        let countryArr =[], k = 0;
    {
        for (let i = 0; i < country.length; i++) {
            if (country[i].item_code - cityNode.value > 0 && country[i].item_code - cityNode.value < 100)
                countryArr[k++] = country[i];
        }
        let countryStr = '';
        for (let l = 0; l < countryArr.length; l++) {
            countryStr += `<option value=${countryArr[l].item_code}>${countryArr[l].item_name}</option>`;
        }
        countryNode.innerHTML = countryStr;
    }
    }
})();
