<template>
  <div class="saude">
    <div class="div">
      <div class="frame">
        <img class="ellipse" alt="Ellipse" src="ellipse-1.svg" />
        <div class="text-wrapper-2">Saúde</div>
        <ArrowBack class="arrow-back" color="#FEF7FF" />
      </div>
      <div class="m-dia-de-BPM">Média de&nbsp;&nbsp;BPM</div>
      <div class="text-wrapper-3">Niveis</div>
      <div class="frame-2" />
      <Rectangle class="rectangle-24" />
      <div class="text-wrapper-4">Colesterol....................................10</div>
      <div class="text-wrapper-5">Calcio ....................................10</div>
      <div class="text-wrapper-6">Glicemia....................................10</div>
    </div>
  </div>
</template>

<script>
import { ArrowBack } from "./ArrowBack";
import { Rectangle } from "./RectangleBox";

export default {
  name: "SaudeComponent",
  components: {
    ArrowBack,
    Rectangle,
  },
};
</script>

<style>
.saude {
  background-color: #ffffff;
  display: flex;
  flex-direction: row;
  justify-content: center;
  width: 100%;
}

.saude .div {
  background-color: #ffffff;
  height: 932px;
  overflow: hidden;
  position: relative;
  width: 430px;
}

.saude .frame {
  background-color: #1b436b;
  box-shadow: 0px 4px 4px #00000040;
  height: 75px;
  left: 0;
  overflow: hidden;
  position: absolute;
  top: 0;
  width: 430px;
}

.saude .ellipse {
  height: 30px;
  left: -465px;
  position: absolute;
  top: -966px;
  width: 63px;
}

.saude .text-wrapper-2 {
  color: #ffffff;
  font-family: "Poppins-Regular", Helvetica;
  font-size: 36px;
  font-weight: 400;
  height: 61px;
  left: 120px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  text-align: center;
  top: 6px;
  width: 190px;
}

.saude .arrow-back {
  height: 24px !important;
  left: 12px !important;
  position: absolute !important;
  top: 12px !important;
  width: 24px !important;
}

.saude .m-dia-de-BPM {
  color: #000000;
  font-family: "Poppins-Regular", Helvetica;
  font-size: 20px;
  font-weight: 400;
  left: 12px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  text-align: center;
  top: 103px;
  width: 193px;
}

.saude .text-wrapper-3 {
  color: #000000;
  font-family: "Poppins-Regular", Helvetica;
  font-size: 20px;
  font-weight: 400;
  left: -5px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  text-align: center;
  top: 324px;
  width: 155px;
}

.saude .frame-2 {
  background-color: #1b436b;
  height: 93px;
  left: 0;
  position: absolute;
  top: 839px;
  width: 430px;
}

.saude .rectangle-24 {
  left: 44px !important;
  position: absolute !important;
  top: 155px !important;
}

.saude .text-wrapper-4 {
  color: #000000;
  font-family: "Roboto-Regular", Helvetica;
  font-size: 20px;
  font-weight: 400;
  left: 44px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  top: 401px;
  width: 304px;
}

.saude .text-wrapper-5 {
  color: #000000;
  font-family: "Roboto-Regular", Helvetica;
  font-size: 20px;
  font-weight: 400;
  left: 47px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  top: 506px;
  width: 388px;
}

.saude .text-wrapper-6 {
  color: #000000;
  font-family: "Roboto-Regular", Helvetica;
  font-size: 20px;
  font-weight: 400;
  left: 47px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  top: 453px;
  white-space: nowrap;
  width: 298px;
}
</style>