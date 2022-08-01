<template>
  <div class="sign-content">
    <div class="sign-content-wrap">
      <div class="sign-content-top">
        <p>약관동의</p>
        <div class="agreement-top"></div>
      </div>
      <div class="agreement-bottom">
        <div class="agreement-all" @click="allClick">
          <input id="checkbox1" type="checkbox" v-model="id1" />
          통합 서비스 이용약관, 개인정보 수집 및 이용, 유효기간
          5년(선택),프로모션 정보 수신(선택) 에 모두 동의합니다.
        </div>
        <div
          class="agreement-content"
          v-for="(value, index) in info"
          :key="index"
        >
          <div
            class="agreement-content-title"
            @click="titleClickActive($event.target)"
          >
            <input type="checkbox" name="test" />
            {{ value.agreementTitle }}
            <div class="agreement-mg"></div>
          </div>
          <div class="agreement-content-info">
            {{ value.agreementContent }}
          </div>
        </div>
      </div>
      <div>
        <button @click="boxCheck" class="blue-btn pa-20">다음</button>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
    return {
      id1: false,
      info: [],
    }
  },
  computed: {},
  mounted() {
    this._load()
  },
  methods: {
    _load() {
      axios
        .request({
          url: '/api/v1/agreement/info',
        })
        .then((res) => {
          this.info = res.data
        })
        .catch((error) => {
          console.log(error)
        })
    },
    allClick() {
      this.id1 = !this.id1

      const arr = document.querySelectorAll('[type=checkbox]')
      if (this.id1) {
        for (let a of arr) {
          a.checked = true
        }
      } else {
        for (let a of arr) {
          a.checked = false
        }
      }
    },
    titleClickActive(el) {
      if (!el.children.length) {
        return
      } else {
        let checkbox = el.querySelector('input')
        if (checkbox.checked) {
          checkbox.checked = false
        } else {
          checkbox.checked = true
        }
      }

      const checkArr = document.querySelectorAll('input[name=test]')
      let number = 0
      for (let a of checkArr) {
        if (a.checked) {
          number += 1
        }
      }
      if (checkArr.length === number) {
        this.id1 = true
      } else if (checkArr.length > number) {
        this.id1 = false
      }
    },
    boxCheck() {
      if (!this.id1) {
        alert('약관에 동의를 하셔야 합니다.')
      }
    },
  },
}
</script>

<style></style>
