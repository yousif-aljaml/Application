from telegram import Update
from telegram.ext import Updater, CommandHandler, MessageHandler, Filters, CallbackContext

# استبدل 'YOUR_TOKEN' بالتوكن الذي حصلت عليه من BotFather
TOKEN = '1239144699:AAF2X1-auksACBpMJM_8GBL0zRtSVEcGjcc'

def start(update: Update, context: CallbackContext) -> None:
    update.message.reply_text('مرحبًا! أنا بوت تيليجرام. كيف يمكنني مساعدتك؟')

def echo(update: Update, context: CallbackContext) -> None:
    update.message.reply_text(update.message.text)

def main():
    # إنشاء Updater وإدخال التوكن
    updater = Updater(1239144699:AAF2X1-auksACBpMJM_8GBL0zRtSVEcGjcc)

    # الحصول على dispatcher لتسجيل المعالجات
    dispatcher = updater.dispatcher

    # معالجات الأوامر
    dispatcher.add_handler(CommandHandler("start", start))

    # معالجة الرسائل العادية
    dispatcher.add_handler(MessageHandler(Filters.text & ~Filters.command, echo))

    # بدأ البوت
    updater.start_polling()

    # تشغيل البوت حتى تضغط Ctrl-C
    updater.idle()

if __name__ == '__main__':
    main()
